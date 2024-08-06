import pandas as pd

def dropDuplicateEmails(customers: pd.DataFrame) -> pd.DataFrame:
    x=customers.drop_duplicates(subset='email', keep='first')
    return x
