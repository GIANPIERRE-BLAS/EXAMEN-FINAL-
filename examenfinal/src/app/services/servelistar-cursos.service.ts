import { Injectable, inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServelistarCursosService {
 
  private http = inject(HttpClient)
  listarCursos(){
    return this.http.get('http://localhost:8090/api/cursos')
  }
}
