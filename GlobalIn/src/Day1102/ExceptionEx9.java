package Day1102;

import Day1103.MemoryException;
import Day1103.SpaceException;

public class ExceptionEx9 {

	static void startInstall() throws SpaceException, MemoryException {
		// 충분한 설치 공간이 없으면...
		if(!enoughSpace()){
			throw new SpaceException("설치할 공간이 부족합니다.");
		}

		// 충분한 메모리 공간이 없으면...
		if(!enoughMemory()) {
			throw new MemoryException("메모리가 부족합니다.");
		}
	}

	static void copyFile() {
	// 파일 설치시 복사되는 코드
	}
	static void deleteTempFile() {
	// 임시파일 삭제 코드
	}

	// 설치하는 데 필요한 공간이 있는지 확인하는 코드 작성
	static boolean enoughSpace() {
		return false;
	}
	// 설치하는데 필요한 메모리 공간이 있는지 확인하는 코드 작성
	static boolean enoughMemory() {
	return false;
	}

	public static void main(String[] args) {
		try {
			startInstall(); // 프로그램 설치
			copyFile(); // 파일 복사
		} catch (SpaceException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
			e.printStackTrace();
			System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
		} catch (MemoryException me) {
			System.out.println("에러 메세지 : " + me.getMessage());
			me.printStackTrace();
			System.gc();
			// garbage collection : 메모리정리를 수행하여 메모리 공간을 확보함
			System.out.println("메모리를 확보한 후에 다시 설치하시기 바랍니다.");
		} finally {
			deleteTempFile();
	         // 프로그램 설치에 사용된 임시파일들을 삭제처리
	      }
	}
}