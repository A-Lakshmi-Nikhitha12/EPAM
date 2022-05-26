//composite example internal file system of computer(pictures , vedioes , subfolders)
public interface IFile
{
	public double GetSize();
}
public class Folder
{
	public List<Vedioes> vedioes = new List<Vedioes>();
	public List<Pictures> pictures = new List<Pictures>();
	public List<Folder> folders = new List<Folder>();
}
class Folder implements IFile{
	private double calculateSize(Folder folder)
	{
		double total = 0;
		foreach(picture : folder.Pictures)
			total += picture.GetSize();
		foreach(vedio : folder.vedioes)
			total += vedio.GetSize();
		foreach(folder : folder.Folder)
			total += folder.GetSize();
		
		return total;
	}
	public double GetSize()
	{
		return calculateSize(this);
	}
}
//main
public class Composite1 {  
    public static void main(String args[]){  
			galleryFolder.GetSize();
			resume.GetSize();
    }  
} 