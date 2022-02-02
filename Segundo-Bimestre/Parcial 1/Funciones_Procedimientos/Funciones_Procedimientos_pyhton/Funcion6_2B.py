print("")
# ****Método principal*****

# Inicializar las variables
n = 0; num = 0; cont = 0

# Ingresar los datos
print("Función que permita determinar cuántas veces se ha encontrado un número"
+"en un vector")
n = int(input("Ingrese el tamaño del vector: "))

# Declarar el vector
A = [None]*n

print("Ingrese los elementos del vector: ")

for i in range (0,n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]= "))

num = int(input("Ingrese el número a buscar: "))

def BuscarVector(A, num, n):
    cont = 0

    for i in range (0, n):
        if (A[i] == num):
            cont = cont + 1

    return cont

cont = BuscarVector(A, num, n)

print("El número ",num," se ha encontrado ",cont," veces dentro del vector")

# Presentar el vector
for i in range (0,n):
    print(A[i])
