print("")
# Inicializar las variables
valor1 = 0; valor2 = 0; resultado = 0

# Proceso
try:
    valor1 = int(input("Ingrese el valor 1: ")) 
    valor2 = int(input("Ingrese el valor 2: ")) 

    resultado = valor1/valor2

    print("El resultado es: ",resultado)

except Exception as e:
    print("")
    print("Lo sentimos, hay un error de tipo",e)
    print("")
