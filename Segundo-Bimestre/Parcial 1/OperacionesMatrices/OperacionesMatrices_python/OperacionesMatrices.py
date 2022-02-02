print("")
print("---OPERACIONES CON MATRICES---")
n = int(input("Ingrese el número de filas: "))
m = int(input("Ingrese el número de columnas: "))

# Declarar la matriz
A = []

# Recorrer la matriz e ingresar los elementos de la matriz
print("\nIngresar los elementos de la matriz")
for i in range (0, n):
    A.append([])
    for j in range (0, m):
        valor = int(input("A["+str(i)+"]["+str(j)+"]: "))
        A[i].append(valor)

print("\nLa matriz A es: ")
for i in range (0, n):
    for j in range (0, m):
        print(A[i][j], end="   ")
    print("")

# Matriz Transpuesta
print("\nLa matriz transpuesta es: ")
for j in range (0, m):
    for i in range (0, n):
        print(A[i][j], end="   ")
    print("")