public class plant {

    string plantname;
    string color;
    int hight;

    plant (){
        this("rose");
        system.out.println("no parameter constructor");
    
    }

    plant(string plantname){
        this("rose","rose1");
        system.out.println(plantname);

    }
    plant(string plantname,string color){
        this("red",350);
        system.out.println(plantname);
        system.out.println(color);

    }
    plant(string color,int hight){
        system.out.println(color);
        system.out.println(hight);

    }
    plant(string plantname,stringg color,int hight){
        this.plantname=plantname;
        this.color=color;
        this.hight=hight;

    }
    public static void main(sting[],args){
        plant plant1=newplant();

    }
}