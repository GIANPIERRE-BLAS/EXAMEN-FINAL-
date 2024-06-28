import { Routes } from '@angular/router';
import { ListarCursosComponent } from './listar-cursos/listar-cursos.component';

export const routes: Routes = [

    {path: 'cursos', component: ListarCursosComponent},
    {path: '', redirectTo:'/cursos', pathMatch: 'full'},
];
