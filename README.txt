===> Archetecture de prog :
	- monolithic : UI - Controller - business logic dans un meme endroit
	- microservices : chaque fonctionalite a son endroit (separation des taches)


==> pour envoyer les donnes de l'application vers une 
	autre il faut normalise C donne 
		(object -> JSON,XML = Serialisation) 
	(l'invers de cette operation s'appelle deserialisation=decode + denormalisation )

==> Dependency "WebSpring" certe à creer des restfull
	Api

==> pour avoir une bn organisation, il faut creer un 
	package ".Controllers", "Responses", "Requests", "Services", "Entities", "Repositories" dans le package principe 

==> Pour que une class joue le role d'un controller il
	faut etre preceder par @RestController/@Controller

==> chaque controller est preceder par 
	@RequestMapping("/path") : le path pour que les methode d'un controller soient executer 

==> chaque method dans le controller doit la preciser 
	la method avec laquelle on va l'appelle(PostMapping ,GetMapping, PutMapping, DeleteMapping)

==> application.xml : la config du l'application

==> pour config la bd :
	spring.datasource.username=root
	spring.datasource.password=
	spring.datasource.url=jdbc:mysql:localhost:3306/my_db
	spring.jpa.hibernate.ddl-auto=update

==> to get data from externe to method in controlle we
	should add annotion in parag of method 
	public String 
	createUser(@RequestBody UserRequest userRequest){}
	
==> pour avoir une bn organisation, il faut creer
	ObjectRequest,ObjectResponse pour chaque donner qu on veux la communiquer avec l'externe

==>  apres avoir get donne in controller il faut les 
	- copy (BeansUtils.copyProperties(from,to)) dans un object "dto" shared 
	- les envoyer au service Layer que va s'occuper des traitement necessaire et return un object de type "dto" 
	- puis il faut copy la response de service dans ObjectResp

==> pour inplementer une interface as class il faut ajouter
	@Autowired et dans la class qui implement l'interface on ajoute @Service

==> chaque table dans la base don ne doit avoir une class 
	dans Entities preceder par l'annotation entity(name="NameTable") que implemnt '²Serializable'

==> pour effectuer des operation crud sur les object il 
	faut creer une interface ObjectRepository (preceder par @Repository) qui extends l'interface 'CrudRepository' 
	cette 'crudRepository' prend en params la class Entity corresp et le type de l'id de class corsp (long devient Long)

==>