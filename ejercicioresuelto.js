var numero1 = 5;
var numero2 = 8;

if (numero1 < numero2) {
  alert("El numero 1 no es mayor que el numero 2");
} else {
  alert("Vuelve a intentar");
}
if (numero2 > 0) {
  alert("El numero 2 es positivo");
} else {
  alert("Vuelve a intentar");
}
if (numero1 > !0) {
  alert("numero 1 es negativo o distinto de cero");
} else {
  alert("Vuelve a intentar");
}
if ((numero1 = numero1 + 1) < numero2) {
  alert(
    "Incrementar en 1 unidad el valor de numero 1 no lo hace mayor o igual que numero 2"
  );
} else {
  alert("Vuelve a intentar");
}
