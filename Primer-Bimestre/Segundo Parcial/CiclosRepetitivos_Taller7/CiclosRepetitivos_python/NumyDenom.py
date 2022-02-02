# Inicializar las variables
n = 0; i = 1; num = 1; den = 2; term = 0; suma = 0

# Ingrese los datos
n = int(input("Ingrese el límite: "))

# Proceso
while (i <= n):
    term = num/den
    print("El término ",i,"es:",num,"/",den)
    suma = suma + term
    num = num + 2
    den = den + 3
    i= i + 1

print("La suma es: ",suma)
