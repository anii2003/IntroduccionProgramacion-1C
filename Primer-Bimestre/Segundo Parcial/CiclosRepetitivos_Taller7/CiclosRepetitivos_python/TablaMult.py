#Inicializar las variables
num = 0; i = 1; mult = 0; n = 0

#Ingresar los datos
print("***Tabla de multiplicar***")
num = int(input("Ingrese un número: "))
n = int(input("Ingrese el límite: "))

#Proceso
while (i <= n):
    mult = num *  i
    print(num,"x",i,"=",mult)
    i = i + 1