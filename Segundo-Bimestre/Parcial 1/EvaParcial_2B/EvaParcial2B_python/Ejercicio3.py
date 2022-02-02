print("")
# Inicializar las variables
n = 5; suma1 = 0; suma2 = 0; l = 0; k = 0
prom1 = 0; prom2 = 0; Pdec1 = 0; Pdec2 = 0

# Declarar las matrices
A = []
B = []

# Ingresar los datos de la matriz A
print("***Ingresar los elementos de la matriz A***")
for i in range (0,n):
    A.append([])
    for j in range (0, n):
            valor = int(input("A ["+str(i)+"]["+str(j)+"] : "))
            A[i].append(valor)

# Ingresar los datos de la matriz B
print("***Ingresar los elementos de la matriz B***")
for i in range (0,n):
    B.append([])
    for j in range (0, n):
            valor = int(input("B ["+str(i)+"]["+str(j)+"] : "))
            B[i].append(valor)

# Obtener el promedio de la diagonal secundaria de la matriz A
for i in range (0,n):
    for j in range (0,n):
        if (i+j == n-1):
            suma1 = suma1 + A[i][j]
            k = k + 1
        
prom1 = suma1/k

# Si el promedio es decimal su operación con la función MOD
# dará diferente de 0, por tanto solo tomaremos la parte entera.

if (prom1 % 1 != 0):
    Pdec1 = prom1 % 1
    prom1 = prom1 - Pdec1

print("\nPromedio entero Diagonal Secundaria Matriz A: ",prom1)

# Obtener el promedio de la diagonal secundaria de la matriz B
for i in range (0,n):
    for j in range (0,n):
        if (i+j == n-1):
            suma2 = suma2 + B[i][j]
            l = l + 1

prom2 = suma2 / l

# Si el promedio es decimal su operación con la función MOD
# dará diferente de 0, por tanto solo tomaremos la parte entera.

if (prom2 % 1 != 0):
    Pdec2 = prom2 % 1
    prom2 = prom2 - Pdec2       

print("\nPromedio entero Diagonal Secundaria Matriz B: ",prom2)

if (prom1 == prom2):
    print("\nLos promedios de las diagonales secundarias de las matrices son iguales")
else:
    print("\nLos promedios de las diagonales secundarias de las matrices NO son iguales")