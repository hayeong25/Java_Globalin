package Day1118;

// 텍스트에 문자를 기록

import java.io.*;

public class BufferedWriterEx {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter("c:/pk/hello.txt");
			bw = new BufferedWriter(fw);
			// 파일에 텍스트를 기록
			bw.write("우리는 민족 중흥을 역사적");
			bw.newLine();
			bw.write(" 사명을 띠고 이 땅에 태어났다." + System.getProperty("line.separator"));
			// System.getProperty("line.separator"); : 시스템의 행 종결문자를 반환
			// line.separator : 행의 끝을 지정
			bw.write("조상의 빛난 얼을 이어 받는다.");
			bw.flush();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			try {
				if(fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

			try {
				if(bw != null) {
					bw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
				
			}
		}
	}
}