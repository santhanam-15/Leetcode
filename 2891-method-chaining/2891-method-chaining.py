import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    for i in animals.index:
        if(animals.loc[i,"weight"]<100):
            animals.drop(i,inplace=True)
    animals=animals.sort_values(by="weight",ascending=False)
    return animals[["name"]]