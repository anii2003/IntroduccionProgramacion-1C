print("")
"""""Construir una función que reciba como parámetro un vector de 10 posiciones enteras
y retorne la posición del número entero que tenga mayor cantidad de dígitos"""

# Inicializar las variables
n = 10; aux = 0

# Declarar el vector
A = [None]*n

# Ingresar los datos en el vector
for i in range (0, n):
    A[i] = int(input("Ingrese el elemento A["+str(i)+"]: "))

# Función para determinar en qué posición se encuentra el número con más dígitos

def Pos_Mdig(A, n):
    nd = 0; mayor = 0; aux = 0

    # Determinar el número de cifras de cada valor almacenado

    for i in range (0,n,1):
        if (A[i]<0):
            A[i] = -A[i]

        if (A[i] == 0):
            nd = 1

        nd = 0

        while (A[i]>0):
            A[i] = A[i] // 10
            nd = nd + 1

        if (nd > mayor):
            mayor = nd
            aux = i
            
    return aux

# Asignar un valor a la función y mostrar el resultado
aux = Pos_Mdig(A, n)

print("\nEl número con mayor cantidad de dígitos se encuentra en la posición A[",aux,"]")
print("")        