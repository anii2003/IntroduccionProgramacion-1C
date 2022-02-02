print("")

# Inicializar las variables
n = 0

# Ingresar los datos
n = int(input("Ingrese el número de elementos del vector: "))

i = n

# Declarar los vectores V y C
V = [None]*50
C = [None]*50

for i in range (0, n):
    V[i] = int(input("Ingrese el elemento V["+str(i)+"]: "))   

# Realizar la función
def Cuadrado_Suc(m):
    r = 0
    j = m
    while (j != 0):
        r = r + m
        j = j - 1
    return r
    
# Llamado de la función que calcula los cuadrados de números
for i in range (0, n):
    C[i] = Cuadrado_Suc(V[i])

# Impresión de los cuadrados sucesivos contenidos en el vector C
i = 0

while (i<n):
    print("El número contenido en la posición "+str(i)+" del vector")
    print(V[i]," tiene cuadrado ",C[i])
    i = i + 1
