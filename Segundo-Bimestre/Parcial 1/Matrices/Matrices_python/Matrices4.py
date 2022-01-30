# Inicializar las variables
i = 0; j = 0; menor = 0; n=0; l=0; k=0

print("---EJERCICIO 4 - MATRICES---")
n = int(input("Ingrese el tamaño de la matriz: "))

# Declarar la matriz e ingresar sus datos
A =  []

print("Ingresar los elementos de la matriz")
for i in range (0, n):
    A.append([])
    for j in range (0, n):
        valor = int(input("A["+str(i)+"]["+str(j)+"] = "))
        A[i].append(valor)

print("\nMATRIZ A ORIGINAL")
for i in range (0, n):
    for j in range (0, n):
        print(A[i][j], end="   ")
    print(" ")

for i in range (0, n):
    menor = A[i][0]
    for j in range (0, n):
        if (A[i][j]< menor):
            menor = A[i][j]
            k = i
            l = j
    print("El elemento menor de la fila " +str(i) + " es "
        ,menor," y está en A["+str(k)+"]["+ str(l) +"]")
    k = 0
    j = 0