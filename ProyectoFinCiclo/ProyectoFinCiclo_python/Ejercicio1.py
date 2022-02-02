""" Leer n números enteros, almacenarlos en un vector y determinar
en que posición está el número con más dígitos"""

# Inicializar las variables
n = 0; nd = 0; mayor = 0; aux = 0

# Solicitar el tamaño del vector
n = int(input("Ingrese el tamaño del vector: "))

# Declarar el vector
A = [None]*n

# Ingresar los datos en el vector
for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))

# Determinar el número de cifras de cada valor almacenado
print("")

for i in range (0, n):
    if (A[i]<0):
        A[i] = -A[i]
    
    if (A[i] == 0):
        nd = 1
    nd = 0

    while (A[i]>0):
        A[i] = A[i] // 10
        nd = nd + 1

    print("A["+str(i)+"] tiene ",nd," dígitos")

    if (nd > mayor):
        mayor = nd
        aux = i
    
print("\nEl número con mayor cantidad de dígitos se encuentra en la posición A [",aux,"]")
print("")