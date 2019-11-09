package myb;
public class srbean
{
private String language;
private int empid;

public void setLanguage(String la)
{
this.language=la;
}

public int getEmpid() {
	return empid;
}

public int setEmpid(int id) {
	return this.empid = id;
	
}

public String getLanguage()
{
return language;
}

public String getComment()
{
if(language.equals("java"))
return "The King Of Object Oriented Language";


if(language.equals("dotnet"))
return "MicroSoft Technology";

else
return "Sorry No Details";
}
}