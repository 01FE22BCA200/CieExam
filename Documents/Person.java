public class Person{
    public String name;
    public int age;
    public int date, month, year;

    public Person(String name){
        this.name = name;
    }

    public void displayName(){
        System.out.println("Person Name: "+this.name);
    }

    public void displayAge(int date, int month, int year){
        int agecount = 0;
        int todayDate = 19;
        int todayMonth = 3;
        int todayYear = 2024;
        int i, j, k;

        if(! (date == todayDate || month == todayMonth || year == todayYear)){
            for(i=year;i<=todayYear;i++){
                for(j=month;j<=todayMonth;j++){
                    for(k=date;k<=todayDate;k++){
                        
                    }
                }
                agecount++;
            }
        }

        System.out.println("Age: "+agecount);
    }

    public static void main(String[] args) {
        Person p1 = new Person("Ram");
        p1.displayName();
        p1.displayAge(22, 11, 2001);
    }
    
}