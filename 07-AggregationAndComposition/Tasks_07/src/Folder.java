import java.util.ArrayList;

public class Folder {
    private String name;
    private ArrayList<File>fileArray=new ArrayList<File>();
    Folder(String name){
        this.name=name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void addFile(File fileName){
        fileArray.add(fileName);
    }
    public void displayContent(){
        System.out.println("Files in this folder: ");
        for(File file: fileArray){
            System.out.println(file.getName());
        }
    }
    public void removeFile(File fileName){
        fileArray.remove(fileName);
    }

    public static void main(String[] args) {
        Folder folder = new Folder("Folder");
        File f1 = new File("File_1");
        File f2 = new File("File_2");

        folder.addFile(f1);
        folder.addFile(f2);
        folder.displayContent();
        folder.removeFile(f1);
        folder.displayContent();
    }

}
