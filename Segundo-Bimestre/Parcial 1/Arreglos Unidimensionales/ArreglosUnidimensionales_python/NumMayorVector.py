print("")
# Inicializar las variables
i = 0; n = 0; mayor = 0

# Ingresar los datos
n = int(input("Ingrese el tamaño del vector: "))

# Declarar el vector
A = [None]*n

for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))
    if (i == 0):
        mayor = A[i]
    if (mayor < A[i]):
        mayor = A[i]

for i in range (0, n):
    if (mayor == A[i]):
        print("A ["+str(i)+"] contiene el número mayor y es: ",mayor)