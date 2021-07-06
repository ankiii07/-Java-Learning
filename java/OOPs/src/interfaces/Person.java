package interfaces;

public class Person implements Student, YouTuber{

	public static void main(String[] args) {
		
		Person obj = new Person();
		obj.study();
		obj.makeVideo();
		
		YouTuber obj2 = obj;
		obj.editVideo();
		obj.makeVideo();
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("person is study");
	}

	@Override
	public void makeVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is make video");
	}

	@Override
	public void editVideo() {
		// TODO Auto-generated method stub
		System.out.println("person is good in editing");
	}
	public void VideoEditor()
	{
		
	}

}
