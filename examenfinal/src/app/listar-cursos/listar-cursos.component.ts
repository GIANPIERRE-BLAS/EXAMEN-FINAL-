import { Component, inject } from '@angular/core';
import { ServelistarCursosService } from '../services/servelistar-cursos.service';
@Component({
  selector: 'app-listar-cursos',
  standalone: true,
  imports: [],
  templateUrl: './listar-cursos.component.html',
  styleUrl: './listar-cursos.component.css'
})
export class ListarCursosComponent {
  private cursoService=inject(ServelistarCursosService);
cursos: any[] = [];
    ngOnInit(): void{
     
      this.cursoService.listarCursos().subscribe((cursos:any) => {
        this.cursos=cursos;
        });
    }

}
