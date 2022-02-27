package Day1103;

public class ChainedExceptionEx {

	static void install() throws InstallException {
		try {
			startInstall();
			copyFiles();
		} catch (SpaceException e) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(e); // InstallException의 원인 예외를 SpaceException으로 지정
			throw ie; // 예외 발생 시킴
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외 발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles(); // 프로그램 설치에 사용된 임시 파일들을 삭제한다
		}
	}
	static void startInstall() throws SpaceException, MemoryException {
		// 설치 공간이 충분하지 않을 경우
		// 메모리가 충분하지 않을 경우
	}
	static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지를 확인하는 코드
		return false;
	}
	static boolean enoughMemory() {
		// 설치하는데 필요한 메모리 공간이 있는지를 확인하는 코드
		return true;
	}
	static void copyFiles() {
	}
	static void deleteTempFiles() {
	}
	public static void main(String[] args) {
		try {
			install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}