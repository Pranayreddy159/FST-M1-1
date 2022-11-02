import pandas as pd
dataframe=pd.read_csv("logindata.csv")
print(dataframe["Usernames"])
print(dataframe["Usernames"][2],dataframe["Passwords"][2])
print(dataframe.sort_values("Usernames"))
print(dataframe.sort_values("Usernames", ascending=False))

	