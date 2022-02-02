print("")

# Declarar la matriz
M = []

print("PROCEDIMIENTO DETERMINANTE MATRIZ ORDEN 3")

for i in range (0,3):
    M.append([])    
    for j in range (0,3):
        valor = int(input("A["+str(i)+"]["+str(j)+"] = "))
        M[i].append(valor) 

# Desarrollar la función Sarrus
def Sarrus(M):
    A = []

    for i in range (0,3):
        A.append([]) 
        for j in range (0,3):
            valor = M [i][j]
            A[i].append(valor)

    print("***Matriz ampliada M***")
    for i in range (0,3):
        for j in range (0,3):
            print(M [i][j],end="   ")
        print(" ") 

    # Columnas adicionales de la matriz ampliada
    print("***MAtriz ampliada A***")
    for i in range (0,3):
        A.append([])
        for j in range (3,5):
            valor = A[i][j-3]
            A[i].append(valor)

    # Imprimir la matriz determinante
    for i in range (0,3):
        for j in range (0,5):
            print(A[i][j],end="   ")
        print(" ")

    # Cálculo del determinante
    i = 0
    k = 0
    j = 0
    dc = 0
    t = 3
    d = 1
    sumad = 0

    while (k<3):
        while ((j<t) and (t<=5)):
            d = d * A[i][j]
            print("D = ",d)
            i = i + 1
            j = j + 1

        sumad = sumad + d
        print("*** Suma D["+str(i)+"] = ",sumad)
        d = 1
        i = 0
        k = k + 1
        dc = dc + 1
        j = dc
        t = t + 1
    i = 0; j = 2; dc = 2; k = 0
    t = 0; z = 1; sumai = 0

    while (k<3):
        while ((j>=t) and (t<3)):
           z = z * A[i][j]
           i = i + 1
           j = j - 1
           print("z = ",z)
        sumai = sumai + z
        print("*** Suma I["+str(i)+"] = ",sumai)
        z = 1
        i = 0
        k = k + 1
        dc = dc + 1
        j = dc
        t = t + 1
    print( "sumad = ",sumad," - sumai = ",sumai)
    det = sumad - sumai
    return det
        
# Aplicarle un valor a la función
det = Sarrus(M)
print("El determinante de la matriz es igual a: ",det)       