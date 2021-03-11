package ch07.exam04;

public class HomeActivity extends Activity{
	//Field
	//COnstructor
	public HomeActivity() {
		super();
	}
	//Method
	@Override
	public void onCreate() {
		super.onCreate();
		System.out.println("자식이 UI요소를 생성합니다.");
		System.out.println("자식이 UI요소의 이벤트를 처리합니다.");
	}
}
