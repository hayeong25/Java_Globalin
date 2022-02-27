package Homework5;

//교재 228p Open Challenge 문제

import java.util.*;

abstract class GameObject { // 추상 클래스
	protected int distance; // 한 번 이동 거리
	protected int x, y; // 현재 위치(화면 맵 상의 위치)
	public GameObject(int startX, int startY, int distance) { // 초기 위치와 이동 거리 설정
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public boolean collide(GameObject p) { // 이 객체가 객체 p와 충돌했을 때 true 리턴
		if(this.x == p.getX() && this.y == p.getY()) {
			return true;
		}
		else {
			return false;
		}
	}
	protected abstract void move(); // 이동한 후의 새로운 위치로 x, y 변경
	protected abstract char getShape(); // 객체의 모양을 나타내는 문자 리턴
}

class Bear extends GameObject {
	private Scanner sc = null;
	public Bear(int x, int y, int distance) {
		super(x, y, distance);
		sc = new Scanner(System.in);
	}
	@Override
	public void move() {
		System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f) >> ");
		char c;
		c = sc.next().charAt(0);
		switch(c) {
		case 'd': // 왼쪽
			x--;
			if(x<0) {
				x = 0;
			}
			break;
		case 'f': // 아래
			y++;
			if(y >= Game.MAX_Y) {
				y = Game.MAX_Y-1;
			}
			break;
		case 'a': // 위
			y--;
			if(y<0) {
				y = 0;
			}
			break;
		case 's': // 오른쪽
			x++;
			if(x>=Game.MAX_X) {
				x = Game.MAX_X-1;
			}
			break;
		}
	}
	@Override
	public char getShape() { // B의 모양 반환
		return 'B';
	}
}

class Fish extends GameObject {

	public Fish(int x, int y, int distance) {
		super(x, y, distance);
	}
	@Override
	public void move() { // 한 번 움직이는 과정 펼쳐놓는 것
		// 0, 1, 2, 3, 4 중에서 0인 경우 +  1인 경우 -  나머지는 정지 
		int n = (int)(Math.random() * 5);
		if(n == 0) {
			x += distance;
		}
		else if(n == 1) {
			x -= distance;
		}
		if(x < 0) {
			x = 0;
		}
		if(x >= Game.MAX_X) {
			x = Game.MAX_X - 1;
		}
		n = (int)(Math.random() * 5);
		if(n == 0) {
			y += distance;
		}
		else if(n == 1) {
			y -= distance;
		}
		if(y < 0) {
			y = 0;
		}
		if(y >= Game.MAX_Y) {
			y = Game.MAX_Y - 1;
		}
	}
	@Override
	public char getShape() { // Fish 모양 리턴
		return '@';
	}
}

class Game {
	public static final int MAX_X = 20;
	public static final int MAX_Y = 10;
	private char map[][] = new char[MAX_X][MAX_Y];
	private GameObject[] m = new GameObject[2];
	private int state;
	// 0 : 게임 중, 1, 2는 둘 중 승리자 
	public Game() {
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) {
				map[j][i] = '-';
			}
		}
		m[0] = new Bear(0, 0, 1);
		m[1] = new Fish(5, 5, 2);
		state = 0; // 게임 중
	}
	public void run() {
		System.out.println("Bear의 Fish 먹기 게임을 시작합니다.");
		update(); // 초기 좌표에 따름
		draw(); // 초기 게임 맵을 보여줌
		while(!doesEnd()) {
			// 현재의 맵을 지움
			clear();
			for (int i = 0; i < m.length; i++) {
				m[i].move();
			}
			update(); // 움직인 후 좌표 변경에 따른 맵 갱신
			draw(); // 그리기
		}
		System.out.println("Bear Wins!!");
	}
	public void clear() {
		for (int i = 0; i < m.length; i++) {
			map[m[i].getY()][m[i].getX()] = '-';
		}
	}
	private void update() {
		//Fish부터 먼저 그려서 Fish를 먹는 경우 Fish가 보이지 않게 함
		for(int i = m.length - 1; i >= 0; i--) {
		map[m[i].getY()][m[i].getX()] = m[i].getShape();
		}
	}	
	private boolean doesEnd() {
		if(m[0].collide(m[1])) {// Bear Fish
			return true;
		}
		else {
			return false;
		}
	}
	public void draw() {
		System.out.println();
		for (int i = 0; i < MAX_Y; i++) {
			for (int j = 0; j < MAX_X; j++) {
				System.out.print(map[j][i]);
			}
			System.out.println();
		}
	}
}

public class BearFishGame {

	public static void main(String[] args) {
		Game g = new Game();
		g.run();

	}
}