print("")
print("***Ejercicio 22, literal b. pág 197-Mancilla")
print("LITERAL B")
# Inicialización de variables
i = 0
j = 0
k = 0

for i in range (3, i > 1, -1):
    for j in range(1,j > i, -1):
        for k in range (i, k > j, -1):
            if i == 1 and j == 1 and k == 1:
                print(i,j,k)
                print("")