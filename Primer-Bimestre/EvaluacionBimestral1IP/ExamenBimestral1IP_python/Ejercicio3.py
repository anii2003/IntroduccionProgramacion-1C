print("")
# Inicializar las variables
num = 1; deno = 7; exp = 2; i = 2; n = 0; suma = 0
# Ingrese los datos
n = int(input("Ingrese un límite: "))

while (i <= n+1):
    print(num,"^",exp,"/",deno)
    num = pow(num, exp)
    term = num/deno
    suma = suma + term

    if (i % 2 == 0):
        num = 2
        exp = exp + 2
        deno = deno + 3
    else:
        num = 1
        exp = exp + 2
        deno = deno + 3
    
    i = i + 1

print("La suma total es: ",suma)