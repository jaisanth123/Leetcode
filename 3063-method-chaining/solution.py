import pandas as pd

def findHeavyAnimals(animals: pd.DataFrame) -> pd.DataFrame:
    x=animals[animals['weight']>100].sort_values(by='weight',ascending=False)[['name']]
    return x
    
