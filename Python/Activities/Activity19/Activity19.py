import pandas as pd
from pandas import ExcelFile
from pandas import ExcelWriter

data={
  "FirstName": ["Satvik", "Avinash", "Lahri"],
	
  "Passwords": ["Shah", "Kati", "Rath"],

  "Email":["satshah@example.com", "avinashk@example.com", "lahri.rath@example.com"],

  "PhoneNumber":["4537829158", "5892184058", "4528727830"]
}
dataframe=pd.DataFrame(data)
Excelwrite=ExcelWriter("EmployeeDetails.xlsx")
dataframe.to_excel(Excelwrite, "Sheet1", index="False")
Excelwrite.save()