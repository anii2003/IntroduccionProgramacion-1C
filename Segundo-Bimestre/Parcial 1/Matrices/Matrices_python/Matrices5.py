print("")
# Inicializar las variables
m = 0; i = 0; j = 0; bandera = 0

# Ingresar el tamaño de la matriz
m = int(input("Ingrese el tamaño de la matriz cuadrada: "))

# Declarar la matriz e ingresar sus datos
A =  []

print("Ingresar los elementos de la matriz A")
for i in range (0, m):
    A.append([])
    for j in range (0, m):
        valor = int(input("A["+str(i)+"]["+str(j)+"] = "))
        A[i].append(valor)

# Determinar si la matriz es simétrica o no
for i in range (0, m):
    for j in range (0, m):
        if (A[i][j] != A[j][i]):
            bandera = 1

if (bandera == 1):
    print("La matriz NO es simétrica")
else:
    if (bandera == 0):
        print("La matriz es simétrica")