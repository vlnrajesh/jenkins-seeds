projectObj = new project()
environment = projectObj.Environment()

folder(environment) {
  displayName(environment)
  description("Mark XL Project")
}
folder(environment+"/Terraform") {
  displayName("Terraform")
  description("Terraform CI & CD Projects")
}
