Spring does a component scan to search for the beans that it manages. In a Spring application, the 
@ComponentScan annotation without any argument tells Spring to scan the current package as well as 
any sub-packages that might exist. Spring detects all classes marked with the @Component, @Repository, 
@Service, and @Controller annotations during component scan.

@Configuration + @EnableAutoConfiguration + @ComponentScan = @SpringBootApplication


@SpringBootApplication by default, searches the package where it is present, as well as all the sub-packages. 
If a bean is present in a package other than the base package or its sub-packages, it will not be found. 
If we want Spring to find beans defined in other packages, we need to use the @ComponentScan annotation and 
provide the path of the package where we want Spring to look for the beans.

@ComponentScan can be used to include or exclude certain packages from being scanned. Include filters are
 used to include certain classes in component scan. Exclude filters are used to stop Spring from 
 auto-detecting classes in component scan.