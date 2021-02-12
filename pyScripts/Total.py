import matplotlib.pyplot as plt
import pandas as pd
df = pd.read_csv('data.csv')
df.plot(kind='bar',stacked=False,)
plt.title('Annual Crime Ratio')
plt.ylabel('Number of Crimes')
plt.xlabel('Years')
plt.show()

