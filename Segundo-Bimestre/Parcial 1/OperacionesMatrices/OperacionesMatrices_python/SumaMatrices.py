print("")
print("***SUMA DE MATRICES***")
n = int(input("Ingrese el tamaño de las matrices a ingresar: "))

# Declarar la matriz
A = []
B = []

print("\nIngresar los elementos de la matriz A")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(valor)

print("\nIngresar los elementos de la matriz B")
for i in range (0, n):
    B.append([])
    for j in range (0, n):
        valor = int(input("B["+str(i)+"]["+str(j)+"]: "))
        B[i].append(valor)

print("\nLa matriz A es: ")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print("")

print("\nLa matriz B es: ")
for i in range (0, n):
    for j in range (0, n):
        print(B[i][j], end="   ")
    print("")

# Suma de matrices
C = []

for i in range (0, n):
    C.append([])
    for j in range (0, n):
        valor = A[i][j] + B[i][j]
        C[i].append(valor)

print("\nLa matriz C (Suma de la matriz A y B) es: ")
for i in range (0, n):
    for j in range (0, n):
        print(C[i][j], end="   ")
    print("")