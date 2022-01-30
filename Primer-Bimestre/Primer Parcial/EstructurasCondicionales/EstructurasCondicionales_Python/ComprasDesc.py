print("")
# Inicializar las variables
precioProd1 = 0; precioProd2 = 0; precioProd3 = 0
cantProd1 = 0; cantProd2 = 0;  cantProd3 = 0
costoProd1 = 0; costoProd2 = 0; costoProd3 = 0
subTotal = 0; desc = 0; IVA = 0; Total = 0
# Ingresar los datos
print("-- Ingrese los datos del producto 1 --")
nomProd1= input("Nombre: ")
precioProd1 = float(input("Precio: "))
cantProd1 = float(input("Cantidad: "))
        
print("-- Ingrese los datos del producto 2 -- ")
nomProd2= input("Nombre: ")
precioProd2 = float(input("Precio: "))
cantProd2 = float(input("Cantidad: "))

print("-- Ingrese los datos del producto 3 -- ")        
nomProd3= input("Nombre: ")
precioProd3 = float(input("Precio: "))
cantProd3 = float(input("Cantidad: "))

# Proceso
costoProd1 = (precioProd1 * cantProd1)
costoProd2 = (precioProd2 * cantProd2)
costoProd3 = (precioProd3 * cantProd3)
        
subTotal = (costoProd1 + costoProd2 + costoProd3)
        
if (subTotal <= 10):
    desc = subTotal * 0.05

else:        
    if ((subTotal > 10) & (subTotal <= 30)):
        desc = subTotal * 0.15
    else:
        if (subTotal > 30):
            desc = subTotal * 0.20

if (subTotal > 30):
    desc = subTotal * 0.20

IVA = ((subTotal - desc) * 0.12)
Total = (subTotal - desc + IVA)

print("-- Producto 1 --")
print("Nombre:   " ,nomProd1)
print("Precio:   " ,precioProd1)
print("Cantidad: " ,cantProd1)
print("          -------------")
print("Costo:   " ,costoProd1)
print("\n")

print("-- Producto 2 --")
print("Nombre:   " ,nomProd2)
print("Precio:   " ,precioProd2)
print("Cantidad: " ,cantProd2)
print("          -------------")
print("Costo:   " ,costoProd2)
print("\n")

print("-- Producto 3 --")
print("Nombre:   " ,nomProd3)
print("Precio:   " ,precioProd3)
print("Cantidad: " ,cantProd3)
print("          -------------")
print("Costo:   " ,costoProd3)
print("\n")

print("-------------------------------")
print("SubTotal:  " ,subTotal)
print("Descuento: " ,desc)
print("Valor IVA: " ,IVA)
print("            -------------------")
print("Total:     " ,Total)
print("\n")