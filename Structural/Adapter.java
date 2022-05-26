//Adapter Pattern(contains target interface , adapter class , adaptee class , client(to interact)
//target interface
public interface IDownloader
{
	byte[] Download(String fileName);
}
//Adaptee class
public class DownloaderApp
{
	public byte[] DownloadResume(String fileName)
	{	
		var downloader = getInstance<IDownloader>();
		var file = downloader.Download(fileName);
		return file;
	}
}
//Adaptee class
public class GoogleDrive
{
	public AuthToken Signin(){}
	public Stream Download(AuthToken token,String fileName){}
}
//Adapter class
public class GoogleAdapter implements IDownloader
{
	public byte[] Download(String fileName)
	{
		var drive = new GoogleDrive();
		var token = drive.Signin();
		var file = drive.Download(token,fileName);
		return file.ToByteArray();
	}
}
//client class
class Adapter
{
	public static void main(String args[])
	{
		GoogleAdapter ga = new GoogleAdapter();
		byte[] file = ga.Download(......);//file name
		//sysout(file);
	}
}
	