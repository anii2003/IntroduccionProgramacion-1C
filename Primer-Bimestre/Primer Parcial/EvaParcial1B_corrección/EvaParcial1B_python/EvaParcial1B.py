#Inicialización de variables
tipo_cli = 0; cant_libros = 0; costo_libro = 0; 
desc = 0; descTotal = 0; subtotal = 0; total = 0

# Datos de entrada
nombre = input("Ingrese el nombre del cliente: ")
tipo_cli = int(input("Ingrese el tipo de cliente: "))
cant_libros = int(input("Ingrese la cantidad de libros: "))
costo_libro = float(input("Ingrese el costo por libros: "))
print("")

# Proceso
if (tipo_cli == 1):
    desc = 0.30

elif (tipo_cli == 2):
    desc = 0.20

elif (tipo_cli == 3):
    desc = 0

else:
    print("La opción que ingresó no existe")

# Condición para determinar el descuento por cantidad de libros

if ((cant_libros > 5) & (cant_libros <= 10)):
    desc = desc + 0.04

else:
    if (cant_libros > 10) :
        desc = desc + 0.08

# Obtener el subtotal y el valor neto a pagar
subtotal = cant_libros * costo_libro
descTotal = (subtotal * desc)
total = subtotal - descTotal

# Presentar los datos de salida
print("Nombre del cliente: ",nombre)
print("Total a pagar: " ,subtotal," dólares")
print("Descuento: " ,descTotal," dólares")
print("Neto a pagar: " ,total," dólares")
print("")