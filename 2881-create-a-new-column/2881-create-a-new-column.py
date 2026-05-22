import pandas as pd

def createBonusColumn(emp: pd.DataFrame) -> pd.DataFrame:
    emp['bonus'] = emp['salary'] * 2
    return emp