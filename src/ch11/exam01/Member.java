package ch11.exam01;

public class Member {
	private String id;
	private String name;
	
	public Member(String id,String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) { //클래스타입이 멤버냐
			Member m=(Member)obj;
			if(id.equals(m.id)&&name.equals(m.name)) {
				return true;
			}else {
				return false;
			}
		}else {
			return false;
		}
	}
}
