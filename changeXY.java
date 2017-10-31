public String changeXY(String str) {
  
  if(str.contains("x")) return changeXY(str.replace('x','y'));
  if(str.contains("y")) return str;
  return str;
}
