print("")
# Inicializar las variables
i = 0; j = 0; n = 0; aux = 0

# Pedir el límite del vector
print("***ORDENAR UN VECTOR DE N ELEMENTOS***")
n = int(input("Ingrese el tamaño del vector: "))

# Declarar el vector
A = [None]*n

# Ingresar los datos en el vector
for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]= "))

# Presentar el vector
print("\n---VECTOR ORIGINAL---")
for i in range (0, n):
    print("A[",i,"]: ",A[i])

print("\n---VECTOR ORDENADO DE FORMA ASCENDENTE---")

for i in range (0, n):
    for j in range (i+1, n):
        if (A[i] > A[j]):
            aux = A[i]
            A[i]=A[j]
            A[j] = aux

# Presentar el vector ordenado
for i in range (0, n):
    print("A[",i,"]: ",A[i])
    
print("")