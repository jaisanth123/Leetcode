import pandas as pd

def getDataframeSize(players: pd.DataFrame) -> List[int]:
    x,y=players.shape
    t=[x,y]
    return t
    
