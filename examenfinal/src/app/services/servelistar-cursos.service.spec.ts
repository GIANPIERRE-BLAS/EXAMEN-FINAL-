import { TestBed } from '@angular/core/testing';

import { ServelistarCursosService } from './servelistar-cursos.service';

describe('ServelistarCursosService', () => {
  let service: ServelistarCursosService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ServelistarCursosService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
