print("Ingrese 2 números para realizar una operación:")
num1 = float(input("Número 1: "))
num2 = float(input("Número 2: "))

print("Seleccione una operación:")
print("1. Sumar")
print("2. Restar")
print("3. Multiplicar")
print("4. Dividir")

opcion = input("Ingrese el número de la operación: ")

if opcion == '1':
    resultado = num1 + num2
    print(f"El resultado de la suma es: {resultado}")
    
elif opcion == '2':
    resultado = num1 - num2
    print(f"El resultado de la resta es: {resultado}")
    
elif opcion == '3':
    resultado = num1 * num2
    print(f"El resultado de la multiplicación es: {resultado}")
    
elif opcion == '4':
    if num2 != 0:
        resultado = num1 / num2
        print(f"El resultado de la división es: {resultado}")
    else:
        print("Error: No se puede dividir por cero.")
        
else:
    print("Opción no válida. Por favor, seleccione una operación válida.")
