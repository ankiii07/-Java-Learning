package interfaces;

public abstract interface YouTuber extends VideoEditor 
{

	abstract void  makeVideo();
	
	default void VideoEditor()
	{
		System.out.println("person is good in Video Editing");
	}
}
