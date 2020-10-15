public class DoctorList {
    private String[] doclist;
    private int count = 0;
    public DoctorList(){
        doclist = new String[10];
        doclist[0] = "dr holloway";
        doclist[1] = "Dr drakakis";
        count=2;

    }
    public void addDoctor(String name){
        doclist[count] = name;
        count++;

    }
    public String GetName(int id){
        return doclist[id];

    }
}
