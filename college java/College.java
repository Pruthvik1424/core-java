public class College{

CollegeName collegeName;
CollegeLocation collegeLocation;
DepartmentName nameOfDepartments;
CollegeType collegeType;
NumOfSec noOfSections;
SectionName nameofSection;
NumOfHods noOfHods;
NumOfClassrooms noOfClassrooms;
NumOfVans noOfVans;
NumOfDrivers noOfDrivers;


public College(CollegeName collegeName, CollegeLocation collegeLocation, DepartmentName nameOfDepartments, CollegeType collegeType, NumOfSec noOfSections,
                SectionName nameofSection, NumOfHods noOfHods, NumOfClassrooms noOfClassrooms, NumOfVans noOfVans, NumOfDrivers noOfDrivers) {
				   
				   this.collegeName = collegeName;
				   this.collegeLocation = collegeLocation;
				   this.nameOfDepartments = nameOfDepartments;
				   this.collegeType = collegeType;
				   this.noOfSections = noOfSections;
				   this.nameofSection = nameofSection;
				   this.noOfHods = noOfHods;
				   this.noOfClassrooms = noOfClassrooms;
				   this.noOfVans = noOfVans;
				   this.noOfDrivers = noOfDrivers;
				   
			   }
			   
public void CollegeData() {
	
	System.out.println("CollegeData:");
	System.out.println("Collegename :" + collegeName );
	System.out.println("Collegelocation :" + collegeLocation );
	System.out.println("Departmentname :" + nameOfDepartments );
	System.out.println("Collegetype :" + collegeType );
	System.out.println("Numofsec :" + noOfSections );
	System.out.println("Sectionname :" + nameofSection );
	System.out.println("Numofclassrooms :" + noOfClassrooms );
	System.out.println("Numofvans :" + NumOfVans );
	System.out.println("Numofdrivers :" + noOfDrivers);
	
    }			   
               

}