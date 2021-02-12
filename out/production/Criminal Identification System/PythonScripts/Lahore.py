import matplotlib.pyplot as plt
import pandas as pd
colors_list = ['gold', 'yellowgreen', 'lightcoral', 'lightskyblue', 'lightgreen', 'pink']
df = pd.read_csv('data.csv')
city="Lahore"
df[city].plot(kind='pie',autopct='%1.1f%%',startangle=90,shadow=True,labels=None,colors=colors_list)
plt.title('Annual Crime Ratio '+city)
plt.axis('equal')
plt.legend(labels=df.index, loc='upper left')
plt.show()