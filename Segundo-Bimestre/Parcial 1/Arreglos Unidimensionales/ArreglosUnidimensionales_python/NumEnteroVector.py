print("")
# Inicializar las variables
i = 0; n = 0; num = 0; cont = 0

n = int(input("Ingrese el tamaño del vector: "))
num = int(input("Ingrese un número entero: "))

# Declaramos los vectores
A = [None]*n

for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))
    if (A[i] == num):
        cont = cont + 1

for i in range (0, n):
    if (A[i] == num):
        print("El número entero ",num," se ha repetido en la posición: A["+str(i)+"]")

print("El número entero ",num," se ha repetido ",cont," veces")