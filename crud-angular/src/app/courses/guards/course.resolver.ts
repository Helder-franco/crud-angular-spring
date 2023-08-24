import { inject } from '@angular/core';
import { ActivatedRouteSnapshot, RouterStateSnapshot } from '@angular/router';
import { of } from 'rxjs';

import { CoursesService } from '../services/courses.service';

export function courseResolver(route: ActivatedRouteSnapshot,
  state: RouterStateSnapshot) {
  if (route.params['id']) {
    console.log(route.paramMap.get('id')!);
    return inject(CoursesService).loadById(route.paramMap.get('id')!);
  }
  return of({ id: '', name: '', category: '' });
}
